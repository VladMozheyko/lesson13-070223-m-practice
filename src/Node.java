public class Node {                  // Класс для узла
    int data;                        // Сама информация

    Node left;                       // Левый потомок
    Node right;                      // Правый потомок
    Node parent;                     // Родитель текущего

    boolean color;                   // Цвет узла

    public Node(int data) {          // Конструктор
        this.data = data;
    }
}
