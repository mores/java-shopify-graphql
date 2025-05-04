package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Deletes specific quantity rules from a price list using a product variant ID.
 * You can use the `quantityRulesDelete` mutation to delete a set of quantity rules from a price list.
 */
public class QuantityRulesDeleteGraphQLQuery extends GraphQLQuery {
  public QuantityRulesDeleteGraphQLQuery(String priceListId, List<String> variantIds,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (priceListId != null || fieldsSet.contains("priceListId")) {
        getInput().put("priceListId", priceListId);
    }if (variantIds != null || fieldsSet.contains("variantIds")) {
        getInput().put("variantIds", variantIds);
    }
  }

  public QuantityRulesDeleteGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "quantityRulesDelete";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String priceListId;

    private List<String> variantIds;

    private String queryName;

    public QuantityRulesDeleteGraphQLQuery build() {
      return new QuantityRulesDeleteGraphQLQuery(priceListId, variantIds, queryName, fieldsSet);
               
    }

    /**
     * The ID of the price list from which the quantity rules will be deleted.
     */
    public Builder priceListId(String priceListId) {
      this.priceListId = priceListId;
      this.fieldsSet.add("priceListId");
      return this;
    }

    /**
     * A list of product variant IDs whose quantity rules will be removed from the price list.
     */
    public Builder variantIds(List<String> variantIds) {
      this.variantIds = variantIds;
      this.fieldsSet.add("variantIds");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
