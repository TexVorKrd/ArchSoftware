package Editor3D.modelEements;

import java.util.LinkedList;
import java.util.List;

/**
 * Модель построеная на основании полигонов и тктурой натянутой на эту модель.
 * Модель содерит минимум один полигон.
 */
public class PoligonalModel {
    public List<Poligon> poligons;
    public List<Texture> textures;

    public PoligonalModel(List<Texture> textures) {
        this.textures = textures;
        this.poligons = new LinkedList<>();
        this.poligons.add(new Poligon());
    }
}
