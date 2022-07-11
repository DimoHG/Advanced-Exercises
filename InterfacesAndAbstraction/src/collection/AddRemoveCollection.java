package collection;

public class AddRemoveCollection extends Collection implements AddRemovable{
    @Override
    public String remove() {
        return items.remove(items.size() - 1);
    }

    @Override
    public int add(String element) {
        items.add(0, element);
        return 0;
    }
}
