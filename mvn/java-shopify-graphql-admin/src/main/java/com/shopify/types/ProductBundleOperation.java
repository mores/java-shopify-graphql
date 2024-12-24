package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class ProductBundleOperation implements com.shopify.types.Node, com.shopify.types.ProductOperation {
  
  private String id;

  
  private Product product;

  
  private ProductOperationStatus status;

  
  private List<ProductBundleMutationUserError> userErrors;

  public ProductBundleOperation() {
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  
  public ProductOperationStatus getStatus() {
    return status;
  }

  public void setStatus(ProductOperationStatus status) {
    this.status = status;
  }

  
  public List<ProductBundleMutationUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<ProductBundleMutationUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "ProductBundleOperation{id='" + id + "', product='" + product + "', status='" + status + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductBundleOperation that = (ProductBundleOperation) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(product, that.product) &&
        Objects.equals(status, that.status) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, product, status, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String id;

    
    private Product product;

    
    private ProductOperationStatus status;

    
    private List<ProductBundleMutationUserError> userErrors;

    public ProductBundleOperation build() {
      ProductBundleOperation result = new ProductBundleOperation();
      result.id = this.id;
      result.product = this.product;
      result.status = this.status;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder product(Product product) {
      this.product = product;
      return this;
    }

    
    public Builder status(ProductOperationStatus status) {
      this.status = status;
      return this;
    }

    
    public Builder userErrors(List<ProductBundleMutationUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
