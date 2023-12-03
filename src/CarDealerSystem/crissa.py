import pygame
import random
import sys

Initialize Pygame
pygame.init()

Constants
WIDTH, HEIGHT = 800, 600
WHITE = (255, 255, 255)
FPS = 60

User
PADDLE_WIDTH, PADDLE_HEIGHT = 20, 100
paddle = pygame.Rect(50, HEIGHT // 2 - PADDLE_HEIGHT // 2, PADDLE_WIDTH, PADDLE_HEIGHT)

Trash can
TRASHCAN_WIDTH, TRASHCAN_HEIGHT = 100, 150
trash_can = pygame.Rect(WIDTH - TRASHCAN_WIDTH - 50, HEIGHT // 2 - TRASHCAN_HEIGHT // 2, TRASHCAN_WIDTH, TRASHCAN_HEIGHT)

Trash
trash_colors = [(255, 0, 0), (0, 255, 0), (0, 0, 255)]  # Red, Green, Blue
trash_width, trash_height = 30, 30
trash_list = []

Initialize Pygame window
win = pygame.display.set_mode((WIDTH, HEIGHT))
pygame.display.set_caption("Trash Bounce Game")

Clock to control the frame rate
clock = pygame.time.Clock()

class Trash(pygame.Rect):
    def init(self, x, y, width, height, color):
        super().init(x, y, width, height)
        self.color = color
        self.speed_x = -5

Main game loop
while True:
    # Event handling
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            pygame.quit()
            sys.exit()

    # Move user with arrow keys
    keys = pygame.key.get_pressed()
    if keys[pygame.K_UP] and paddle.top > 0:
        paddle.y -= 5
    if keys[pygame.K_DOWN] and paddle.bottom < HEIGHT:
        paddle.y += 5
Move trash from right to left and bounce when hitting the user
    for t in trash_list:
        t.x += t.speed_x

        # Bounce when hitting the user
        if t.colliderect(paddle):
            t.speed_x = -t.speed_x

        # Check if trash is out of the screen
        if t.right < 0:
            trash_list.remove(t)

    # Create new trash at random intervals
    if random.randint(1, 100) < 5:
        new_trash = Trash(WIDTH - TRASHCAN_WIDTH - 50, random.randint(0, HEIGHT - trash_height), trash_width, trash_height, random.choice(trash_colors))
        trash_list.append(new_trash)

    # Draw background
    win.fill(WHITE)

    # Draw user and trash can
    pygame.draw.rect(win, (0, 0, 0), paddle)
    pygame.draw.rect(win, (0, 0, 0), trash_can)

    # Draw trash
    for t in trash_list:
        pygame.draw.rect(win, t.color, t)

    # Update display
    pygame.display.flip()

    # Cap the frame rate
    clock.tick(FPS)