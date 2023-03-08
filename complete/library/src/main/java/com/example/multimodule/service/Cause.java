
public class Cause{
    private String causeName;
    // private Hashmap<Cause, List<NonProfit>> allCauses ;
    private List<NonProfit> nps;
    private List<Hashmap<Cause, List<NonProfit>> allCauses;



    // list of non profits
    // cause object : key
    // list of all causes
    // add hashmap into the list of all causes

    // A list of np associated with cause obj
    // Class Cause
    // Causemap: [key is causeobject, list of non profit objects)
    // Cause object (name)


    public Cause(){
        this.causeName =causeName;
        nps = new ArrayList<>();
        allCauses = new List<Hashmap<Cause, List<NonProfit>>;
    }

    public void addNonProgit(NonProfit np, Cause cause){

        for(int index =0; index <= allCauses.size(); index++){
            if(allCauses.get(index).containsKey(cause)){
                // update the list of non profits
                List<NonProfit> temp = allCauses.get(index).get(cause);
                temp.add(np);
                allCauses.put(cause, temp);
            }
        }

        // List<NonProfit> allnps = allCauses.get()

    }



}

