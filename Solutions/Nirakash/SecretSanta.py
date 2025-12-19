import random
import os
import time

players = ["Nirakash", "Anisha", "Aaakash", "Aastha", "Nolan", "Aaron"]

def clear_screen():
    os.system("cls" if os.name == "nt" else "clear")

def generate_secret_santa(players):
    while True:
        receivers = players.copy()
        random.shuffle(receivers)
        if all(giver != receiver for giver, receiver in zip(players, receivers)):
            return dict(zip(players, receivers))

# Generate assignments
secret_santa = generate_secret_santa(players)

clear_screen()
print("🎄 Secret Santa Game 🎄")
print("Assignments are hidden. Pass the keyboard to each player.\n")

for player in players:
    input(f"{player}, press ENTER to see who you are gifting to...")
    clear_screen()

    print(f"🎁 {player}, you will give a gift to:")
    print(f"\n👉 {secret_santa[player]} 👈\n")

    input("Press ENTER when you're done (screen will clear)...")
    clear_screen()

print("🎉 All players have seen their assignments. Game over!")

