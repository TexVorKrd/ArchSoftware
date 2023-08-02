package Editor3D.modelEements;

import Editor3D.Stuff.Angle3D;
import Editor3D.Stuff.Point3D;

/**
 * Камера для обзора сцены с возможностью изменения ее положения и точки обзора внутри сцены.
 * location - положение камеры внутри сцны
 * angle - направление озора.
 */
public class Camera {
    public Point3D locaion;
    public Angle3D angle;

    /**
     * Поворот камеры
     *
     * @param angle3D - новый угол обзора
     */
    public void rotate(Angle3D angle3D) {

    }

    /**
     * Перемещение камеры в новую точку сцены
     *
     * @param point3D - точка в которую будет переещена камера
     */
    public void move(Point3D point3D) {

    }
}
