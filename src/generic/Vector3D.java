package generic;

/**
 * Created by arabk on 13.08.2017.
 */
public class Vector3D<T> {
    private T x,y,z;
    public Vector3D() {
        x = null;
        y = null;
        z = null;
    }
    public Vector3D(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public T getY() {
        return y;
    }

    public void setY(T y) {
        this.y = y;
    }

    public T getZ() {
        return z;
    }

    public void setZ(T z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Vector3D{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vector3D<?> vector3D = (Vector3D<?>) o;

        if (x != null ? !x.equals(vector3D.x) : vector3D.x != null) return false;
        if (y != null ? !y.equals(vector3D.y) : vector3D.y != null) return false;
        return z != null ? z.equals(vector3D.z) : vector3D.z == null;
    }

    @Override
    public int hashCode() {
        int result = x != null ? x.hashCode() : 0;
        result = 31 * result + (y != null ? y.hashCode() : 0);
        result = 31 * result + (z != null ? z.hashCode() : 0);
        return result;
    }
}
