package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.ProductStatus;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class ProductDuplicateGraphQLQuery extends GraphQLQuery {
  public ProductDuplicateGraphQLQuery(String productId, String newTitle, ProductStatus newStatus,
      Boolean includeImages, Boolean includeTranslations, Boolean synchronous, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (productId != null || fieldsSet.contains("productId")) {
        getInput().put("productId", productId);
    }if (newTitle != null || fieldsSet.contains("newTitle")) {
        getInput().put("newTitle", newTitle);
    }if (newStatus != null || fieldsSet.contains("newStatus")) {
        getInput().put("newStatus", newStatus);
    }if (includeImages != null || fieldsSet.contains("includeImages")) {
        getInput().put("includeImages", includeImages);
    }if (includeTranslations != null || fieldsSet.contains("includeTranslations")) {
        getInput().put("includeTranslations", includeTranslations);
    }if (synchronous != null || fieldsSet.contains("synchronous")) {
        getInput().put("synchronous", synchronous);
    }
  }

  public ProductDuplicateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "productDuplicate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String productId;

    private String newTitle;

    private ProductStatus newStatus;

    private Boolean includeImages;

    private Boolean includeTranslations;

    private Boolean synchronous;

    private String queryName;

    public ProductDuplicateGraphQLQuery build() {
      return new ProductDuplicateGraphQLQuery(productId, newTitle, newStatus, includeImages, includeTranslations, synchronous, queryName, fieldsSet);
               
    }

    
    public Builder productId(String productId) {
      this.productId = productId;
      this.fieldsSet.add("productId");
      return this;
    }

    
    public Builder newTitle(String newTitle) {
      this.newTitle = newTitle;
      this.fieldsSet.add("newTitle");
      return this;
    }

    
    public Builder newStatus(ProductStatus newStatus) {
      this.newStatus = newStatus;
      this.fieldsSet.add("newStatus");
      return this;
    }

    
    public Builder includeImages(Boolean includeImages) {
      this.includeImages = includeImages;
      this.fieldsSet.add("includeImages");
      return this;
    }

    
    public Builder includeTranslations(Boolean includeTranslations) {
      this.includeTranslations = includeTranslations;
      this.fieldsSet.add("includeTranslations");
      return this;
    }

    
    public Builder synchronous(Boolean synchronous) {
      this.synchronous = synchronous;
      this.fieldsSet.add("synchronous");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
