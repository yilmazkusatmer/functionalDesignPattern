package de.yiku.iteratorpattern;

import java.util.List;
import java.util.function.Consumer;

public class Items<E> {
    private List<E> elements;

    public Items(List<E> customItems) {
        this.elements = customItems;
    }

    public List<E> getElements() {
        return elements;
    }

    public void forEach(Consumer<E> action) {
        for (E customItem : elements) {
            action.accept(customItem);
        }
    }

}
