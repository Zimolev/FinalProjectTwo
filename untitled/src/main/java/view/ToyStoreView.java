package view;

public class ToyStoreView extends BaseView {

    public String getMenuItem() {
        String itemMenu;
        try {
            itemMenu = getData("""
                    [1] Вывод всех игрушек на экран
                    [2] Добавление новых игрушек
                    [3] Изменение шанса выпадения игрушки
                    [4] Розыгрыш игрушки
                    [5] Выход
                    """);
            if (!itemMenu.matches("[1-5]+"))
                throw new IllegalArgumentException("Неверный ввод. Введите номер пункта меню...");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return getMenuItem();
        }
        return itemMenu;
    }
}