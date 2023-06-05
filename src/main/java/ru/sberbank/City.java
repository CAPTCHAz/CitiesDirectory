package ru.sberbank;

public class City {
    private String name, region, district, id, population, foundation;
    @Override
    public String toString() {
        return "City{" + getName() + getRegion() + getDistrict() + getPopulation() + getFoundation() + "}";
    }
    public String getName() {
        return "name='"+name + "',";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return "region='" + region + "',";
    }

    public String getRegionName() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getDistrict() {
        return "district='" + district + "',";
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPopulation() {
        return "population='" + population + "',";
    }

    public String getPopulationInt() {return population;}

    public void setPopulation(String population) {
        this.population = population;
    }

    public String getFoundation() {
        return "foundation='" + foundation + "'";
    }

    public void setFoundation(String foundation) {
        this.foundation = foundation;
    }
}

