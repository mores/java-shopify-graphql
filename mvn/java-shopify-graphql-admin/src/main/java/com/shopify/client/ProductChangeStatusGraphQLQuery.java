package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.ProductStatus;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Changes the status of a product. This allows you to set the availability of the product across all channels.
 */
public class ProductChangeStatusGraphQLQuery extends GraphQLQuery {
  public ProductChangeStatusGraphQLQuery(String productId, ProductStatus status, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (productId != null || fieldsSet.contains("productId")) {
        getInput().put("productId", productId);
    }if (status != null || fieldsSet.contains("status")) {
        getInput().put("status", status);
    }
  }

  public ProductChangeStatusGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "productChangeStatus";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String productId;

    private ProductStatus status;

    private String queryName;

    public ProductChangeStatusGraphQLQuery build() {
      return new ProductChangeStatusGraphQLQuery(productId, status, queryName, fieldsSet);
               
    }

    /**
     * The ID of the product.
     */
    public Builder productId(String productId) {
      this.productId = productId;
      this.fieldsSet.add("productId");
      return this;
    }

    /**
     * The status to be assigned to the product.
     */
    public Builder status(ProductStatus status) {
      this.status = status;
      this.fieldsSet.add("status");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
