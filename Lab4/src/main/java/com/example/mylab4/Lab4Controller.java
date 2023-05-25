package com.example.mylab4;

import java.net.URL;
import java.util.*;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import static java.util.Collections.swap;

public class Lab4Controller{

    @FXML
    private ResourceBundle resources;

    @FXML
    private Button btn_clearMassiv;

    @FXML
    private Button btn_clearOutput;

    @FXML
    private Button btn_saveMassiv;

    @FXML
    private MenuItem btn_zad1;

    @FXML
    private MenuItem btn_zad10;

    @FXML
    private MenuItem btn_zad11;

    @FXML
    private MenuItem btn_zad12;

    @FXML
    private MenuItem btn_zad13;

    @FXML
    private MenuItem btn_zad14;

    @FXML
    private MenuItem btn_zad15;

    @FXML
    private MenuItem btn_zad16;

    @FXML
    private MenuItem btn_zad17;

    @FXML
    private MenuItem btn_zad18;

    @FXML
    private MenuItem btn_zad19;

    @FXML
    private MenuItem btn_zad2;

    @FXML
    private MenuItem btn_zad20;

    @FXML
    private MenuItem btn_zad20_1;

    @FXML
    private MenuItem btn_zad3;

    @FXML
    private MenuItem btn_zad4;

    @FXML
    private MenuItem btn_zad5;

    @FXML
    private MenuItem btn_zad6;

    @FXML
    private MenuItem btn_zad7;

    @FXML
    private MenuItem btn_zad8;

    @FXML
    private MenuItem btn_zad9;

    @FXML
    private TextField tf_input;

    @FXML
    private TextArea tf_output;


    class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    class LinkedList {
        public Node head;

        public LinkedList() {
            this.head = null;
        }

        // Другие методы списка...

        public void add(int data) {
            newNode(data);
        }

        public void addFirst(int data) {
            Node newNode = new Node(data); // Создаем новый узел
            newNode.next = head; // Устанавливаем указатель на текущий первый узел
            head = newNode; // Обновляем head, чтобы указывал на новый узел
        }

        public void addLast(int data) {
            newNode(data);
        }

        private void newNode(int data) {
            Node newNode = new Node(data); // create new узел

            if (head == null) { // Если список пуст, новый узел становится первым
                head = newNode;
            } else {
                Node current = head;
                while (current.next != null) {
                    current = current.next; // Переходим к следующему узлу
                }
                current.next = newNode; // Устанавливаем указатель на новый узел
            }
        }

        /*
        public void display() {
            Node current = head;
            while (current != null) {
                String outputText = String.valueOf(current.data + " ");
                tf_output.appendText(outputText);
                current = current.next; // Переходим к следующему узлу
            }
        }*/
        public void display() {
            Node current = head;
            boolean isFirst = true; // Variable pour savoir si c'est le premier élément de la liste
            while (current != null) {
                String outputText;
                if(isFirst){ // Si c'est le premier élément de la liste
                    outputText = "[" + current.data + ", "+ " "; // Ajoute "[" au début
                    isFirst = false;
                } else if(current.next == null){ // Si c'est le dernier élément de la liste
                    outputText = current.data + "]";
                } else { // Si ce n'est ni le premier ni le dernier élément de la liste
                    outputText = current.data + ", ";
                }
                tf_output.appendText(outputText);
                current = current.next; // Переходим к следующему узлу
            }
        }

        public void clear() {
            head = null; // Устанавливаем head в null, освобождая память для всех узлов
        }

        public int size() {
            int count = 0;
            Node current = head;
            while (current != null) {
                count++;
                current = current.next;
            }
            return count;
        }

        public boolean isEmpty() {
            return head == null;
        }

        public void removeFirst() {
            if (head != null) {
                Node temp = head; // Сохраняем ссылку на текущий первый узел
                head = head.next; // Обновляем head, чтобы указывал на следующий узел
                temp.next = null; // Освобождаем ссылку на следующий узел
            }
        }

        public void removeLast() {
            if (head == null || head.next == null) {
                head = null; // Если список пуст или содержит только один элемент, устанавливаем head в null
            } else {
                Node current = head;
                while (current.next.next != null) {
                    current = current.next; // Переходим к следующему узлу
                }
                current.next = null; // Устанавливаем указатель на null, освобождая память последнего узла
            }
        }

        public boolean contains(int value) {
            Node current = head;
            while (current != null) {
                if (current.data == value) {
                    return true; // Значение найдено
                }
                current = current.next;
            }
            return false; // Значение не найдено
        }

        public int findMax() {
            if (head == null) {
                throw new IllegalStateException("Список пуст");
            }

            int max = head.data;
            Node current = head.next;

            while (current != null) {
                if (current.data > max) {
                    max = current.data;
                }
                current = current.next;
            }

            return max;
        }

        public int findMin() {
            if (head == null) {
                throw new IllegalStateException("Список пуст");
            }

            int min = head.data;
            Node current = head.next;

            while (current != null) {
                if (current.data < min) {
                    min = current.data;
                }
                current = current.next;
            }

            return min;
        }

        public void remove(int value) {
            if (head == null) {
                return; // Список пуст, ничего не делаем
            }

            if (head.data == value) {
                head = head.next; // Если искомое значение находится в первом узле, изменяем head
                return;
            }

            Node current = head;
            Node previous = null;

            while (current != null && current.data != value) {
                previous = current;
                current = current.next;
            }

            if (current != null) {
                previous.next = current.next; // Изменяем указатель предыдущего узла, чтобы пропустить узел с искомым значением
            }
        }

        public void removeAll(int value) {
            if (head == null) {
                return; // Список пуст, ничего не делаем
            }

            while (head != null && head.data == value) {
                head = head.next; // Удаляем все узлы с искомым значением в начале списка
            }

            Node current = head;
            Node previous = null;

            while (current != null) {
                if (current.data == value) {
                    if (previous != null) {
                        previous.next = current.next; // Изменяем указатель предыдущего узла, чтобы пропустить узел с искомым значением
                    }
                } else {
                    previous = current;
                }
                current = current.next;
            }
        }

        public void replaceAll(int oldValue, int newValue) {
            Node current = head;

            while (current != null) {
                if (current.data == oldValue) {
                    current.data = newValue; // Заменяем значение текущего узла на новое значение
                }
                current = current.next;
            }
        }

        public boolean isSymmetric() {
            if (head == null) {
                return true; // Пустой список считается симметричным
            }

            // Создаем копию списка в обратном порядке
            LinkedList reversedList = reverse();

            // Сравниваем элементы оригинального списка с элементами списка в обратном порядке
            Node currentOriginal = head;
            Node currentReversed = reversedList.head;

            while (currentOriginal != null && currentReversed != null) {
                if (currentOriginal.data != currentReversed.data) {
                    return false; // Элементы не совпадают, список не симметричный
                }
                currentOriginal = currentOriginal.next;
                currentReversed = currentReversed.next;
            }

            // Проверяем, если остались еще элементы в одном из списков
            return currentOriginal == null && currentReversed == null; // Количество элементов в списках не совпадает, список не симметричный
            // Все элементы совпадают, список симметричный
        }

        // Метод для создания копии списка в обратном порядке
        private LinkedList reverse() {
            LinkedList reversedList = new LinkedList();

            Node current = head;
            while (current != null) {
                Node newNode = new Node(current.data);
                newNode.next = reversedList.head;
                reversedList.head = newNode;
                current = current.next;
            }

            return reversedList;
        }

        public boolean canRemoveTwoElementsForSorted() {
            if (head == null || head.next == null) {
                return true; // Пустой или одноэлементный список уже упорядочен
            }

            Node current = head;
            while (current.next != null) {
                // Проверяем возможность удаления пары элементов (current и current.next)
                if (current.data > current.next.data) {
                    // Пытаемся удалить элемент current
                    if (isListSortedAfterRemoval(current)) {
                        return true;
                    }

                    // Пытаемся удалить элемент current.next
                    return isListSortedAfterRemoval(current.next);

                    // Если не удалось удалить ни текущий элемент, ни следующий элемент,
                    // то невозможно удалить два элемента для получения упорядоченного списка
                }
                current = current.next;
            }

            return true; // Весь список уже упорядочен

        }

        // Метод для проверки упорядоченности списка после удаления указанного элемента
        private boolean isListSortedAfterRemoval(Node node) {
            // Создаем новый список без указанного элемента
            LinkedList newList = new LinkedList();
            Node current = head;

            while (current != null) {
                if (current != node) {
                    newList.addFirst(current.data);
                }
                current = current.next;
            }

            // Проверяем, является ли новый список упорядоченным
            return newList.isSorted();
        }

        // Метод для проверки упорядоченности списка
        private boolean isSorted() {
            if (head == null || head.next == null) {
                return true; // Пустой или одноэлементный список считается упорядоченным
            }

            Node current = head;
            while (current.next != null) {
                if (current.data > current.next.data) {
                    return false; // Нарушено условие упорядоченности
                }
                current = current.next;
            }

            return true; // Весь список упорядочен
        }

        public int countDistinctValues() {
            Set<Integer> uniqueValues = new HashSet<>();
            Node current = head;

            while (current != null) {
                uniqueValues.add(current.data);
                current = current.next;
            }

            return uniqueValues.size();
        }

        public void removeDuplicates() {
            Set<Integer> uniqueValues = new HashSet<>();
            Node current = head;
            Node prev = null;

            while (current != null) {
                if (uniqueValues.contains(current.data)) {
                    // Удаляем повторяющийся элемент
                    prev.next = current.next;
                } else {
                    uniqueValues.add(current.data);
                    prev = current;
                }
                current = current.next;
            }
        }

        public void reverser() {
            Node prev = null;
            Node current = head;

            while (current != null) {
                Node next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }

            head = prev;
        }

        public void mergeSort() {
            head = mergeSortRecursive(head);
        }

        private Node mergeSortRecursive(Node node) {
            if (node == null || node.next == null) {
                return node; // Базовый случай: пустой список или одноэлементный список уже упорядочен
            }

            // Разделяем список на две половины
            Node middle = getMiddle(node);
            Node nextOfMiddle = middle.next;
            middle.next = null;

            // Рекурсивно сортируем каждую половину списка
            Node left = mergeSortRecursive(node);
            Node right = mergeSortRecursive(nextOfMiddle);

            // Объединяем отсортированные половины в один отсортированный список
            return merge(left, right);
        }

        private Node merge(Node left, Node right) {
            Node result = null;

            if (left == null) {
                return right;
            }
            if (right == null) {
                return left;
            }

            if (left.data <= right.data) {
                result = left;
                result.next = merge(left.next, right);
            } else {
                result = right;
                result.next = merge(left, right.next);
            }

            return result;
        }

        // Метод для получения середины списка
        private Node getMiddle(Node node) {
            if (node == null) {
                return null;
            }

            Node slow = node;
            Node fast = node;

            while (fast.next != null && fast.next.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }

            return slow;
        }

        public void insertionSort() {
            if (head == null || head.next == null) {
                return; // Пустой или одноэлементный список уже упорядочен
            }

            Node sorted = null;
            Node current = head;

            while (current != null) {
                Node next = current.next;
                sorted = insertIntoSorted(sorted, current);
                current = next;
            }

            head = sorted;
        }

        private Node insertIntoSorted(Node sorted, Node newNode) {
            if (sorted == null || newNode.data <= sorted.data) {
                newNode.next = sorted;
                return newNode;
            }

            Node current = sorted;
            while (current.next != null && current.next.data < newNode.data) {
                current = current.next;
            }

            newNode.next = current.next;
            current.next = newNode;
            return sorted;
        }
    }


    @FXML
    void initialize() {
        LinkedList linkedList = new LinkedList();
        btn_saveMassiv.setOnAction(actionEvent -> {
            String list = tf_input.getText();
            linkedList.add(Integer.parseInt(list));
            tf_output.clear();
            tf_input.clear();
            linkedList.display();
        });

        btn_clearMassiv.setOnAction(actionEvent -> {
            linkedList.clear();
        });

        btn_clearOutput.setOnAction(actionEvent -> {
            tf_output.clear();
        });

        //Вывод списка
        btn_zad1.setOnAction(actionEvent -> {
            tf_output.clear();
            if (linkedList.isEmpty()) {
                tf_output.setText("null");
            }
            linkedList.display();
        });

        //Добавление в начала списка
        btn_zad2.setOnAction(actionEvent -> {
            String text = tf_input.getText();
            linkedList.addFirst(Integer.parseInt(text));
            tf_output.clear();
            linkedList.display();
        });

        //Добавление элемента в конец списка
        btn_zad3.setOnAction(actionEvent -> {
            String text = tf_input.getText();
            linkedList.addLast(Integer.parseInt(text));
            tf_output.clear();
            linkedList.display();
        });

        //Показ всех элементов списка
        btn_zad4.setOnAction(actionEvent -> {
            tf_output.clear();
            linkedList.display();
        });

        //Удаление всех элементов списка
        btn_zad5.setOnAction(actionEvent -> {
            tf_output.clear();
            linkedList.display();
        });

        //Определение количества элементов списка
        btn_zad6.setOnAction(actionEvent -> {
            tf_output.clear();
            int size = linkedList.size();
            tf_output.setText("Эллементов списка " + size);
        });

        //Проверка списка на пустоту
        btn_zad7.setOnAction(actionEvent -> {
            boolean isEmpty = linkedList.isEmpty();
            if (!isEmpty){
                tf_output.setText("Список не пуст");
            }
            else{
                tf_output.setText("Список пуст" );
            }
        });

        //Удаление первого элемента
        btn_zad8.setOnAction(actionEvent -> {
            tf_output.clear();
            linkedList.removeFirst();
            linkedList.display();
        });

        //Удаление последнего элемента
        btn_zad9.setOnAction(actionEvent -> {
            tf_output.clear();
            linkedList.removeLast();
            linkedList.display();
        });

        //Поиск данного значения в списке
        btn_zad10.setOnAction(actionEvent -> {
            int ind = Integer.parseInt(tf_input.getText());
            boolean index = linkedList.contains(ind);
            tf_output.setText("Значение, найденное " + index);
        });

        //Поиск наибольшего и наименьшего значений в списке
        btn_zad11.setOnAction(actionEvent -> {
            int min = linkedList.findMin();
            int max = linkedList.findMax();
            tf_output.setText("Min element: " + min + "\n" + "Max element: " + max);
        });

        //Удаление элемента списка с данным значением
        btn_zad12.setOnAction(actionEvent -> {
            int index = Integer.parseInt(tf_input.getText());
            linkedList.remove(index);
            tf_output.clear();
            linkedList.display();
        });

        //Удаление всех элементов списка с данным значением
        btn_zad13.setOnAction(actionEvent -> {
            int index = Integer.parseInt(tf_input.getText());
            linkedList.removeAll(index);
            tf_output.clear();
            linkedList.display();
        });

        //Изменение всех элементов списка с данным значением на новое
        btn_zad14.setOnAction(actionEvent -> {
            int index = Integer.parseInt(tf_input.getText());
            linkedList.replaceAll(index, 10);
            tf_output.clear();
            linkedList.display();
        });

        //Определение, является ли список симметричным
        btn_zad15.setOnAction(actionEvent -> {
            boolean otvet = linkedList.isSymmetric();
            if (otvet) {
                tf_output.setText("Список является симметричным.");
            } else {
                tf_output.setText("Список не является симметричным.");
            }

        });


        //Определение, можно ли удалить из списка каких-нибудь два элемента так, чтобы новый список оказался упорядоченным
        btn_zad16.setOnAction(actionEvent -> {
            boolean isOrderable = linkedList.canRemoveTwoElementsForSorted();

            if (isOrderable == true) {
                tf_output.setText("Два элемента могут быть удалены, чтобы упорядочить список.");
            } else {
                tf_output.setText("Два элемента не могут быть удалены, чтобы упорядочить список.");
            }

        });

        //Определение, сколько различных значений содержится в списке
        btn_zad17.setOnAction(actionEvent -> {
            int count = linkedList.countDistinctValues();
            tf_output.setText("Список содержит " + count + " различные значения.");

        });

        //Удаление из списка элементов, значения которых уже встречались в предыдущих элементах
        btn_zad18.setOnAction(actionEvent -> {
            linkedList.removeDuplicates();
            tf_output.clear();
            linkedList.display();

        });

        //Изменение порядка элементов на обратный
        btn_zad19.setOnAction(actionEvent -> {
            linkedList.reverser();
            tf_output.clear();
            linkedList.display();
        });

        //Сортировка элементов списка двумя способами (изменение указателей, изменение значений элементов)
        //Пример сортировки элементов списка с помощью изменения указателей (сортировка слиянием)
        btn_zad20.setOnAction(actionEvent -> {
            linkedList.mergeSort();
            tf_output.clear();
            linkedList.display();
        });

        //Пример сортировки элементов списка с помощью изменения указателей (сортировка слиянием)
        btn_zad20_1.setOnAction(actionEvent -> {
            linkedList.insertionSort();
            tf_output.clear();
            linkedList.display();
        });
    }

}
