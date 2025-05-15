
---

## 📄 Program Description

This Java program simulates a mapping process between two lists as shown in the animation from the quiz assignment.

- `list1` is a list of integers that acts as a sequence of lookup keys.
- `list2` is a list of strings from which values are extracted based on positions calculated from `list1`.
- `list3` is the result list, built by applying a formula to each element in `list1` to determine which elements from `list2` to include.

The formula used to determine the position in `list2` is:

position = 1 + (num - 1)*2

Where `num` is a value from `list1`. This formula maps each number to a corresponding position in `list2` using a specific pattern.

Example:
- If `num = 3`, the index becomes `1 + (3 - 1) * 2 = 5`, so the 5th index (0-based) of `list2` is selected.

The program prints all three lists:
- The original `list1`
- The full `list2`
- The generated `list3`

This program uses the exact values from the animation in the quiz link but is flexible and can work with other values in the lists as well. It is organized under the package `oop.q2` and includes comprehensive Javadoc documentation.

---

## ✅ Features

- Follows the exact logic shown in the animation.
- Uses predefined values for `list1` and `list2` as shown in the quiz.
- Flexible — can work with different values in the future.
- Fully documented using **Javadoc**.
- Clean and concise output.

