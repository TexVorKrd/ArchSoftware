package Editor3D.modelEements;

import Editor3D.Stuff.Angle3D;
import Editor3D.Stuff.Color;
import Editor3D.Stuff.Point3D;

/**
 * Источник сцены внутри сцены.
 * Располагается в точке пространства сцены locaion, с направлением angle, цветом color, мощностью power
 */
public class Flash {
    public Point3D locaion;
    public Angle3D angle;
    public Color color;
    public float power;

    /**
     * Поворот источника света
     *
     * @param angle3D - новое направление
     */
    public void rotate(Angle3D angle3D) {

    }

    /**
     * Переммещение источникаа света
     *
     * @param point3D - Новое положение внутри сцены
     */
    public void move(Point3D point3D) {

    }
}
