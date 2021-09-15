import java.util.ArrayList;

public class RoyalEnfield {

    private int modelId;
    private String modelName;
    private ArrayList<RoyalColor> rc=new ArrayList<RoyalColor>();


    public RoyalEnfield(int modelId, String modelName) {
        this.modelId = modelId;
        this.modelName = modelName;

    }

    public void addcolor( RoyalColor rc){

        this.rc.add(rc);
    }

    @Override
    public String toString() {
        return "RoyalEnfield{" +
                "modelId=" + modelId +
                ", modelName='" + modelName + '\'' +
                ", rc=" + rc +
                '}';
    }
}
