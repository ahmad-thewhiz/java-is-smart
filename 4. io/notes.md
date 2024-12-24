### 3 Key Points of Difference Between `Scanner` and `InputStreamReader`:

1. **Purpose**:
   - **`Scanner`**: Designed for parsing and reading formatted input directly into specific data types (e.g., `int`, `double`, `String`) from various sources like `System.in`, files, or streams.
   - **`InputStreamReader`**: Converts byte streams (e.g., `System.in`) into character streams, typically used with `BufferedReader` for efficient text input handling.

2. **Ease of Use**:
   - **`Scanner`**: Provides high-level methods (e.g., `nextInt()`, `nextDouble()`, `nextLine()`) for input parsing, making it easier for beginners to work with user input.
   - **`InputStreamReader`**: Requires additional effort, like pairing with `BufferedReader` and manually parsing strings into required data types.

3. **Performance**:
   - **`Scanner`**: Slower for handling large inputs due to its parsing overhead.
   - **`InputStreamReader`**: Faster when paired with `BufferedReader`, making it more efficient for reading large-scale or raw data.