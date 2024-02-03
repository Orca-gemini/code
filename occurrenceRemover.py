def remove_char(array, char_to_remove):
    result = [char for char in array if char != char_to_remove]
    return result

original_array = ['a', 'b', 'c', 'a', 'd', 'e']
char_to_remove = 'a'

new_array = remove_char(original_array, char_to_remove)

print(original_array)