### Event Delegation Model
- Event delegation is a technique involving adding event listeners to a parent element instead of adding them to the descendant elements. The listener will fire whenever the event is triggered on the descendant elements due to event bubbling up the DOM.

Example: Button has properties, methods, events, etc. If we want to add an event listener to the button, we can add it to the parent element of the button. This is called event delegation.

- ActionEvent - generated when a button is clicked, a list item is selected, etc. handled by ActionListener interface.
- ItemEvent - generated when an item is selected in a list, a checkbox is checked, etc. handled by ItemListener interface.
- MouseEvent - generated when the mouse is moved, clicked, etc.
- KeyEvent - generated when a key is pressed, released, etc.
- TextEvent - generated when the text in an input field is changed, etc.
- MouseWheelEvent - generated when the mouse wheel is rotated, etc.
- FocusEvent - generated when an element gains or loses focus, etc.
- WindowEvent - generated when the window is opened, closed, etc.
- ComponentEvent - generated when a component is shown, hidden, etc.
- ContainerEvent - generated when a component is added or removed, etc.

