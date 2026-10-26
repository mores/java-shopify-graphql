package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.ProductStatus;
import graphql.language.VariableDefinition;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
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

  public ProductChangeStatusGraphQLQuery(String productId, ProductStatus status, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (productId != null || fieldsSet.contains("productId")) {
        getInput().put("productId", productId);
    }if (status != null || fieldsSet.contains("status")) {
        getInput().put("status", status);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
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

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String productId;

    private ProductStatus status;

    private String queryName;

    public ProductChangeStatusGraphQLQuery build() {
      return new ProductChangeStatusGraphQLQuery(productId, status, queryName, fieldsSet, variableReferences, variableDefinitions);
               
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
     * The ID of the product.
     */
    public Builder productIdReference(String variableRef) {
      this.variableReferences.put("productId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
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

    /**
     * The status to be assigned to the product.
     */
    public Builder statusReference(String variableRef) {
      this.variableReferences.put("status", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ProductStatus"))).build());
      this.fieldsSet.add("status");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
