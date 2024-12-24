package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.OptionCreateInput;
import com.shopify.types.ProductOptionCreateVariantStrategy;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class ProductOptionsCreateGraphQLQuery extends GraphQLQuery {
  public ProductOptionsCreateGraphQLQuery(String productId, List<OptionCreateInput> options,
      ProductOptionCreateVariantStrategy variantStrategy, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (productId != null || fieldsSet.contains("productId")) {
        getInput().put("productId", productId);
    }if (options != null || fieldsSet.contains("options")) {
        getInput().put("options", options);
    }if (variantStrategy != null || fieldsSet.contains("variantStrategy")) {
        getInput().put("variantStrategy", variantStrategy);
    }
  }

  public ProductOptionsCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "productOptionsCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String productId;

    private List<OptionCreateInput> options;

    private ProductOptionCreateVariantStrategy variantStrategy;

    private String queryName;

    public ProductOptionsCreateGraphQLQuery build() {
      return new ProductOptionsCreateGraphQLQuery(productId, options, variantStrategy, queryName, fieldsSet);
               
    }

    
    public Builder productId(String productId) {
      this.productId = productId;
      this.fieldsSet.add("productId");
      return this;
    }

    
    public Builder options(List<OptionCreateInput> options) {
      this.options = options;
      this.fieldsSet.add("options");
      return this;
    }

    
    public Builder variantStrategy(ProductOptionCreateVariantStrategy variantStrategy) {
      this.variantStrategy = variantStrategy;
      this.fieldsSet.add("variantStrategy");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
