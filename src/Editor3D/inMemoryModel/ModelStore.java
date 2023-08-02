package Editor3D.inMemoryModel;

import Editor3D.modelEements.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Хранилище Моделей.
 * Не совсем понятна логика, так как по факту есть сцена с фоделями и источниками света и правильно
 * хранить именно сцены а не сборную солянку вссего.
 */
public class ModelStore implements ImodelChanger {
    public List<PoligonalModel> models;
    public List<Scene> scenes;
    public List<Flash> flashes;
    public List<Camera> cameras;
    private ArrayList<IModelChangedObserver> changedObserver;

    public ModelStore(ArrayList<IModelChangedObserver> iModelChangedObservers) throws Exception {

        this.changedObserver = iModelChangedObservers;

        this.models = new LinkedList<PoligonalModel>();
        this.scenes = new LinkedList<Scene>();
        this.flashes = new LinkedList<Flash>();
        this.cameras = new LinkedList<Camera>();

        //Выполнение требования по минимум одной модели
        this.models.add(new PoligonalModel(new LinkedList<Texture>()));

        //Выполнение требования по минимум одной сцене
        Scene firstScene = new Scene(new LinkedList<PoligonalModel>(), new LinkedList<Flash>());
        this.scenes.add(firstScene);

        //Выполнение требования по минимум одному источнику света.
        this.flashes.add(new Flash());

        //Выполнение требования по минимум одной камере.
        this.cameras.add(new Camera());

    }

    /**
     * Возвращает сцену по номеру
     *
     * @param number - номер сцены
     * @return - сцена для возврата.
     */
    public Scene getScena(int number) throws Exception {
        if (scenes.size() > number) return scenes.get(number);
        throw new Exception("Неверный номер сцены");
    }

    @Override
    public void notifyChange(ImodelChanger sender) {

    }
}
