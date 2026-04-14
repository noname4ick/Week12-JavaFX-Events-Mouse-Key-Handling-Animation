## Problem 1
(Button Click Counter) Create a JavaFX application ClickCounter.java that:
1. Displays a Label showing "Clicks:
0" in bold, font size 24
2. Displays a Button labelled "Click me!"
3. Each time the button is clicked, increments a counter variable and updates the label to
"Clicks: N"
4. Arranges both controls in a VBox (spacing 20, padding 30, centered)
5. Sets the window title to "Click Counter" and scene size to 300×200
Expected output:
A window with a count label and button. Each click increments the counter displayed
on the label.
## Problem 2
(TextField Calculator) Create SimpleCalc.java that computes the sum of two numbers
entered by the user:
1. Provide two TextFields labelled "Number 1" and "Number 2" inside a GridPane
(hgap 10, vgap 10, padding 20, centered)
2. A Button labelled "Calculate" reads both fields with getText(), parses them to
double inside a try-catch, and displays the result in a non-editable TextField
3. Result is shown as "Sum:
7.50" (two decimal places)
4. If either field is non-numeric, display "Invalid input!" in the result field
5. A Button labelled "Clear" resets all three fields using .clear()
## Problem 3
(Mouse Coordinates) Create MouseCoords.java that tracks the mouse position over a
colored pane:
1. Use a StackPane (400×300) with a light-blue background set via setStyle
2. Register setOnMouseMoved on the pane to update a Label with the current position:
"X: 123.0
Y: 87.0"
3. Register setOnMouseClicked to change the pane background to a random color using
String.format("-fx-background-color: rgb(%d,%d,%d);", r, g, b) where
r, g, b are (int)(Math.random()*256)
4. Register setOnMouseExited to reset the label to "Move the mouse over the pane"
5. Place the label at the bottom of a BorderPane wrapping the stack pane
## Problem 4
(Key Event Logger) Create KeyLogger.java that displays keyboard event information in
real time:
1. Create a TextField for input and a non-editable TextArea (5 rows) for the event log
2. Register setOnKeyPressed on the text field: append a line in the format
"PRESSED | Code: A | Shift: false | Ctrl: false"
3. Register setOnKeyReleased: append "RELEASED | Code:
4. Register setOnKeyTyped: append "TYPED
| Char:
A"
a"
5. Add a Button labelled "Clear Log" that clears the TextArea
6. Arrange controls in a VBox (spacing 10, padding 20); scene size 420×320
## Problem 5
(Draggable Circle) Create DraggableCircle.java that lets the user drag a circle around
the window:
1. Use a Pane (500×400) as the root; place a Circle (radius 40, fill Color.CORAL) at the
center
2. Declare two double fields offsetX and offsetY
3. On setOnMousePressed: record the offset between the mouse position and the circle
center using event.getSceneX() and circle.getCenterX()
4. On setOnMouseDragged: update circle.setCenterX and circle.setCenterY so
the circle follows the mouse smoothly using the recorded offsets
5. Change the circle fill to Color.TOMATO while dragging and revert to Color.CORAL on
setOnMouseReleased
## Problem 6
(Keyboard Move) Create KeyboardMove.java that lets the user move a rectangle using
the arrow keys:
1. Use a Pane (500×400); place a blue Rectangle (60×40) starting at position (220, 180)
2. Set the scene’s setOnKeyPressed handler to move the rectangle by 10 pixels: KeyCode.UP
decreases Y, DOWN increases Y, LEFT decreases X, RIGHT increases X
3. Clamp movement so the rectangle never leaves the pane (0 to width−60 for X, 0 to
height−40 for Y)
4. Display a non-editable TextField at the bottom showing the current position: "X:
220 Y: 180", updated with setText() on every key press
5. Call scene.getRoot().requestFocus() on startup so key events are captured im-
mediately
