import os

# Folder containing the files
folder_name = "block"

# Iterate over every file in the folder
for filename in os.listdir(folder_name):
    file_path = os.path.join(folder_name, filename)

    # Only process files (skip directories)
    if os.path.isfile(file_path):
        # Read the file contents
        with open(file_path, 'r') as file:
            content = file.read()

        if "_glass" in filename:
            # Replace every instance of "hello" with "goodbye"
            updated_content = content.replace("cutout", "translucent")

            # Write the updated content back to the file
            with open(file_path, 'w') as file:
                file.write(updated_content)

print(f"Replaced 'cutout' with 'translucent' in all files within the '{folder_name}' folder.")
