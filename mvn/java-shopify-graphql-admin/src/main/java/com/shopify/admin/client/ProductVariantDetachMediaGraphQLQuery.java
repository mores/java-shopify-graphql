package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.ProductVariantDetachMediaInput;
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
 * Detaches media from product variants.
 */
public class ProductVariantDetachMediaGraphQLQuery extends GraphQLQuery {
  public ProductVariantDetachMediaGraphQLQuery(String productId,
      List<ProductVariantDetachMediaInput> variantMedia, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (productId != null || fieldsSet.contains("productId")) {
        getInput().put("productId", productId);
    }if (variantMedia != null || fieldsSet.contains("variantMedia")) {
        getInput().put("variantMedia", variantMedia);
    }
  }

  public ProductVariantDetachMediaGraphQLQuery(String productId,
      List<ProductVariantDetachMediaInput> variantMedia, String queryName, Set<String> fieldsSet,
      Map<String, String> variableReferences, List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (productId != null || fieldsSet.contains("productId")) {
        getInput().put("productId", productId);
    }if (variantMedia != null || fieldsSet.contains("variantMedia")) {
        getInput().put("variantMedia", variantMedia);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public ProductVariantDetachMediaGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "productVariantDetachMedia";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String productId;

    private List<ProductVariantDetachMediaInput> variantMedia;

    private String queryName;

    public ProductVariantDetachMediaGraphQLQuery build() {
      return new ProductVariantDetachMediaGraphQLQuery(productId, variantMedia, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * Specifies the product to which the variants and media are associated.
     */
    public Builder productId(String productId) {
      this.productId = productId;
      this.fieldsSet.add("productId");
      return this;
    }

    /**
     * Specifies the product to which the variants and media are associated.
     */
    public Builder productIdReference(String variableRef) {
      this.variableReferences.put("productId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("productId");
      return this;
    }

    /**
     * A list of pairs of variants and media to be deleted from the variants.
     */
    public Builder variantMedia(List<ProductVariantDetachMediaInput> variantMedia) {
      this.variantMedia = variantMedia;
      this.fieldsSet.add("variantMedia");
      return this;
    }

    /**
     * A list of pairs of variants and media to be deleted from the variants.
     */
    public Builder variantMediaReference(String variableRef) {
      this.variableReferences.put("variantMedia", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("ProductVariantDetachMediaInput"))))).build());
      this.fieldsSet.add("variantMedia");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
