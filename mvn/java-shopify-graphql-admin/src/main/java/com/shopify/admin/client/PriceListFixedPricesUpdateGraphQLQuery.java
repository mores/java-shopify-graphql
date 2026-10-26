package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.PriceListPriceInput;
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
 * Updates fixed prices on a [`PriceList`](https://shopify.dev/docs/api/admin-graphql/latest/objects/PriceList).
 * This mutation lets you add new fixed prices for specific [`ProductVariant`](https://shopify.dev/docs/api/admin-graphql/latest/objects/ProductVariant)
 * objects and remove existing prices in a single operation.
 *   
 * Use this mutation to modify variant pricing on a price list by providing prices to add and variant IDs to delete.
 *   
 * Learn more about [setting fixed prices for product variants](https://shopify.dev/docs/apps/build/markets/build-catalog#step-3-set-fixed-prices-for-specific-product-variants).
 */
public class PriceListFixedPricesUpdateGraphQLQuery extends GraphQLQuery {
  public PriceListFixedPricesUpdateGraphQLQuery(String priceListId,
      List<PriceListPriceInput> pricesToAdd, List<String> variantIdsToDelete, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (priceListId != null || fieldsSet.contains("priceListId")) {
        getInput().put("priceListId", priceListId);
    }if (pricesToAdd != null || fieldsSet.contains("pricesToAdd")) {
        getInput().put("pricesToAdd", pricesToAdd);
    }if (variantIdsToDelete != null || fieldsSet.contains("variantIdsToDelete")) {
        getInput().put("variantIdsToDelete", variantIdsToDelete);
    }
  }

  public PriceListFixedPricesUpdateGraphQLQuery(String priceListId,
      List<PriceListPriceInput> pricesToAdd, List<String> variantIdsToDelete, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (priceListId != null || fieldsSet.contains("priceListId")) {
        getInput().put("priceListId", priceListId);
    }if (pricesToAdd != null || fieldsSet.contains("pricesToAdd")) {
        getInput().put("pricesToAdd", pricesToAdd);
    }if (variantIdsToDelete != null || fieldsSet.contains("variantIdsToDelete")) {
        getInput().put("variantIdsToDelete", variantIdsToDelete);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public PriceListFixedPricesUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "priceListFixedPricesUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String priceListId;

    private List<PriceListPriceInput> pricesToAdd;

    private List<String> variantIdsToDelete;

    private String queryName;

    public PriceListFixedPricesUpdateGraphQLQuery build() {
      return new PriceListFixedPricesUpdateGraphQLQuery(priceListId, pricesToAdd, variantIdsToDelete, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The price list that the prices will be updated against.
     */
    public Builder priceListId(String priceListId) {
      this.priceListId = priceListId;
      this.fieldsSet.add("priceListId");
      return this;
    }

    /**
     * The price list that the prices will be updated against.
     */
    public Builder priceListIdReference(String variableRef) {
      this.variableReferences.put("priceListId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("priceListId");
      return this;
    }

    /**
     * The fixed prices to add.
     */
    public Builder pricesToAdd(List<PriceListPriceInput> pricesToAdd) {
      this.pricesToAdd = pricesToAdd;
      this.fieldsSet.add("pricesToAdd");
      return this;
    }

    /**
     * The fixed prices to add.
     */
    public Builder pricesToAddReference(String variableRef) {
      this.variableReferences.put("pricesToAdd", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("PriceListPriceInput"))))).build());
      this.fieldsSet.add("pricesToAdd");
      return this;
    }

    /**
     * A list of product variant IDs to remove from the price list.
     */
    public Builder variantIdsToDelete(List<String> variantIdsToDelete) {
      this.variantIdsToDelete = variantIdsToDelete;
      this.fieldsSet.add("variantIdsToDelete");
      return this;
    }

    /**
     * A list of product variant IDs to remove from the price list.
     */
    public Builder variantIdsToDeleteReference(String variableRef) {
      this.variableReferences.put("variantIdsToDelete", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("ID"))))).build());
      this.fieldsSet.add("variantIdsToDelete");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
