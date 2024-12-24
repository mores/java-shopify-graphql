package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.OptionUpdateInput;
import com.shopify.types.OptionValueCreateInput;
import com.shopify.types.OptionValueUpdateInput;
import com.shopify.types.ProductOptionUpdateVariantStrategy;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class ProductOptionUpdateGraphQLQuery extends GraphQLQuery {
  public ProductOptionUpdateGraphQLQuery(OptionUpdateInput option, String productId,
      List<OptionValueCreateInput> optionValuesToAdd,
      List<OptionValueUpdateInput> optionValuesToUpdate, List<String> optionValuesToDelete,
      ProductOptionUpdateVariantStrategy variantStrategy, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (option != null || fieldsSet.contains("option")) {
        getInput().put("option", option);
    }if (productId != null || fieldsSet.contains("productId")) {
        getInput().put("productId", productId);
    }if (optionValuesToAdd != null || fieldsSet.contains("optionValuesToAdd")) {
        getInput().put("optionValuesToAdd", optionValuesToAdd);
    }if (optionValuesToUpdate != null || fieldsSet.contains("optionValuesToUpdate")) {
        getInput().put("optionValuesToUpdate", optionValuesToUpdate);
    }if (optionValuesToDelete != null || fieldsSet.contains("optionValuesToDelete")) {
        getInput().put("optionValuesToDelete", optionValuesToDelete);
    }if (variantStrategy != null || fieldsSet.contains("variantStrategy")) {
        getInput().put("variantStrategy", variantStrategy);
    }
  }

  public ProductOptionUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "productOptionUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private OptionUpdateInput option;

    private String productId;

    private List<OptionValueCreateInput> optionValuesToAdd;

    private List<OptionValueUpdateInput> optionValuesToUpdate;

    private List<String> optionValuesToDelete;

    private ProductOptionUpdateVariantStrategy variantStrategy;

    private String queryName;

    public ProductOptionUpdateGraphQLQuery build() {
      return new ProductOptionUpdateGraphQLQuery(option, productId, optionValuesToAdd, optionValuesToUpdate, optionValuesToDelete, variantStrategy, queryName, fieldsSet);
               
    }

    
    public Builder option(OptionUpdateInput option) {
      this.option = option;
      this.fieldsSet.add("option");
      return this;
    }

    
    public Builder productId(String productId) {
      this.productId = productId;
      this.fieldsSet.add("productId");
      return this;
    }

    
    public Builder optionValuesToAdd(List<OptionValueCreateInput> optionValuesToAdd) {
      this.optionValuesToAdd = optionValuesToAdd;
      this.fieldsSet.add("optionValuesToAdd");
      return this;
    }

    
    public Builder optionValuesToUpdate(List<OptionValueUpdateInput> optionValuesToUpdate) {
      this.optionValuesToUpdate = optionValuesToUpdate;
      this.fieldsSet.add("optionValuesToUpdate");
      return this;
    }

    
    public Builder optionValuesToDelete(List<String> optionValuesToDelete) {
      this.optionValuesToDelete = optionValuesToDelete;
      this.fieldsSet.add("optionValuesToDelete");
      return this;
    }

    
    public Builder variantStrategy(ProductOptionUpdateVariantStrategy variantStrategy) {
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
