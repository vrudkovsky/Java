package entity;

import java.util.*;


public class Family11 {
    public Human11 father;
    public Human11 mother;
    public List<Object> children = new ArrayList<>();
    public Set<Object> pet11 = new HashSet<>();


    public Family11(Human11 father, Human11 mother) {
        this.father = father;
        this.mother = mother;
        this.mother.setFamily(this);
        this.father.setFamily(this);
    }


    public Human11 getFather() {
        return father;
    }

    public void setFather(Human11 father) {
        this.father = father;
    }

    public Human11 getMother() {
        return mother;
    }

    public void setMother(Human11 mother) {
        this.mother = mother;
    }


    public List<Object> getChildren() {
        return children;
    }

    public void setChildren(List<Object> children) {
        this.children = children;
    }

    public void addChild(Human11 child) {
       this.children.add(child);
       child.setFamily(this);
    }

    public void deleteChild(int index){
        if (index < 0 ||index > this.children.size() -1 ){
            return;
        }
        List<Object> tempChildren = new ArrayList<>(this.children.size()-1);
        for(int i = 0; i < children.size(); i++){
            if(i< index ) {
                tempChildren.set(i, this.children.get(i));
            } else if (i>index){
                tempChildren.set(i - 1, this.children.get(i));
            }
        }
        children = tempChildren;
    }
    public void deleteChild(Object child){
        this.children.remove(child);
    }

    public Set<Object> getPets() {
        return pet11;
    }

    public void addPet(Pet11 pet11) {
        this.pet11.add(pet11);
        pet11.setFamily(this);
    }




    public int countFamily(){
        return 2 + children.size();

    }

    @Override
    public String toString() {
        return "Family9{" +
                "father=" + father +
                ", mother=" + mother +
                ", children=" + children +
                ", pet9=" + pet11 +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Family11)) return false;
        Family11 family11 = (Family11) o;
        return Objects.equals(father, family11.father) &&
                Objects.equals(mother, family11.mother) &&
                Objects.equals(children, family11.children) &&
                Objects.equals(pet11, family11.pet11);
    }

    @Override
    public int hashCode() {
        return Objects.hash(father, mother);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println( "Family{" +
                "father=" + father +
                ", mother=" + mother +
                ", children=" + children +
                ", pet9=" + pet11 +
                '}');
    }
}
