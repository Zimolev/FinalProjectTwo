package model;

public class Toys {
     Integer id;
     String titleToy;
     Integer count;
     Integer chanceToWin;

    public Toys(Integer id, String titleToy, Integer count, Integer chanceToWin) {
        this.id = id;
        this.titleToy = titleToy;
        this.count = count;
        this.chanceToWin = chanceToWin;
    }

    public Toys() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitleToy() {
        return titleToy;
    }

    public void setTitleToy(String titleToy) {
        this.titleToy = titleToy;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getChanceToWin() {
        return chanceToWin;
    }

    public void setChanceToWin(Integer chanceToWin) {
        this.chanceToWin = chanceToWin;
    }

    @Override
    public String toString() {
        return "model.Toys{" +
                "id=" + id +
                ", titleToy='" + titleToy + '\'' +
                ", count=" + count +
                ", chanceToWin=" + chanceToWin +
                '}';
    }
}
