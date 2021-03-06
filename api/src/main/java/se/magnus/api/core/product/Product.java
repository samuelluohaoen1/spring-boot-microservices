package se.magnus.api.core.product;

/**
 * This type of POJO class is also known as a DTO (Data Transfer Object) as it is used to
 * transfer data between the API implementation and the caller of the API. Remember that
 * we also have DAO (Data Access Object) whose sole purpose is for ORM (Object Relational Mapping).
 */
public class Product {
    private final int productId;
    private final String name;
    private final int weight;
    private final String serviceAddress;

    public Product() {
        productId = 0;
        name = null;
        weight = 0;
        serviceAddress = null;
    }

    public Product(int productId, String name, int weight, String serviceAddress) {
        this.productId = productId;
        this.name = name;
        this.weight = weight;
        this.serviceAddress = serviceAddress;
    }

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String getServiceAddress() {
        return serviceAddress;
    }
}
