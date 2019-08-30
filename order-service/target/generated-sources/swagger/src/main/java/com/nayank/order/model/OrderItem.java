package com.nayank.order.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.nayank.order.model.Address;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OrderItem
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-08-31T03:11:10.158+05:30")

public class OrderItem   {
  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("type")
  private String type = null;

  /**
   * order status
   */
  public enum StatusEnum {
    ACTIVE("active"),
    
    SUSPENDED("suspended"),
    
    CANCELLED("cancelled");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("status")
  private StatusEnum status = null;

  @JsonProperty("customer")
  private UUID customer = null;

  @JsonProperty("products")
  @Valid
  private List<UUID> products = new ArrayList<UUID>();

  @JsonProperty("orderdate")
  private OffsetDateTime orderdate = null;

  @JsonProperty("price")
  private Double price = null;

  @JsonProperty("shipAddress")
  private Address shipAddress = null;

  public OrderItem id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "d290f1ee-6c54-4b01-90e6-d701748f0851", required = true, value = "")
  @NotNull

  @Valid

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public OrderItem type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "new Phone", required = true, value = "")
  @NotNull


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public OrderItem status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * order status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "order status")
  @NotNull


  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public OrderItem customer(UUID customer) {
    this.customer = customer;
    return this;
  }

  /**
   * Get customer
   * @return customer
  **/
  @ApiModelProperty(example = "d290f1ee-6c54-4b01-90e6-d701748f0851", required = true, value = "")
  @NotNull

  @Valid

  public UUID getCustomer() {
    return customer;
  }

  public void setCustomer(UUID customer) {
    this.customer = customer;
  }

  public OrderItem products(List<UUID> products) {
    this.products = products;
    return this;
  }

  public OrderItem addProductsItem(UUID productsItem) {
    this.products.add(productsItem);
    return this;
  }

  /**
   * Get products
   * @return products
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public List<UUID> getProducts() {
    return products;
  }

  public void setProducts(List<UUID> products) {
    this.products = products;
  }

  public OrderItem orderdate(OffsetDateTime orderdate) {
    this.orderdate = orderdate;
    return this;
  }

  /**
   * Get orderdate
   * @return orderdate
  **/
  @ApiModelProperty(example = "2016-08-29T09:12:33.001+0000", required = true, value = "")
  @NotNull

  @Valid

  public OffsetDateTime getOrderdate() {
    return orderdate;
  }

  public void setOrderdate(OffsetDateTime orderdate) {
    this.orderdate = orderdate;
  }

  public OrderItem price(Double price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
  **/
  @ApiModelProperty(example = "10.0", required = true, value = "")
  @NotNull


  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public OrderItem shipAddress(Address shipAddress) {
    this.shipAddress = shipAddress;
    return this;
  }

  /**
   * Get shipAddress
   * @return shipAddress
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public Address getShipAddress() {
    return shipAddress;
  }

  public void setShipAddress(Address shipAddress) {
    this.shipAddress = shipAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderItem orderItem = (OrderItem) o;
    return Objects.equals(this.id, orderItem.id) &&
        Objects.equals(this.type, orderItem.type) &&
        Objects.equals(this.status, orderItem.status) &&
        Objects.equals(this.customer, orderItem.customer) &&
        Objects.equals(this.products, orderItem.products) &&
        Objects.equals(this.orderdate, orderItem.orderdate) &&
        Objects.equals(this.price, orderItem.price) &&
        Objects.equals(this.shipAddress, orderItem.shipAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, status, customer, products, orderdate, price, shipAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderItem {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    products: ").append(toIndentedString(products)).append("\n");
    sb.append("    orderdate: ").append(toIndentedString(orderdate)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    shipAddress: ").append(toIndentedString(shipAddress)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

