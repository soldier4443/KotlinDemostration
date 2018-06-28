package java.basic;

import java.util.Objects;

public final class Item {
    private float x;
    private float y;
    
    public Item(float x, float y) {
        this.x = x;
        this.y = y;
    }
    
    public float getX() {
        return x;
    }
    
    public void setX(float x) {
        this.x = x;
    }
    
    public float getY() {
        return y;
    }
    
    public void setY(float y) {
        this.y = y;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item)o;
        return Float.compare(item.x, x) == 0 &&
            Float.compare(item.y, y) == 0;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
