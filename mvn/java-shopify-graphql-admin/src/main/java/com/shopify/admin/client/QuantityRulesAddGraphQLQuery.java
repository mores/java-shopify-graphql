package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.QuantityRuleInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Creates or updates existing quantity rules on a price list.
 * You can use the `quantityRulesAdd` mutation to set order level minimums,
 * maximumums and increments for specific product variants.
 */
public class QuantityRulesAddGraphQLQuery extends GraphQLQuery {
  public QuantityRulesAddGraphQLQuery(String priceListId, List<QuantityRuleInput> quantityRules,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (priceListId != null || fieldsSet.contains("priceListId")) {
        getInput().put("priceListId", priceListId);
    }if (quantityRules != null || fieldsSet.contains("quantityRules")) {
        getInput().put("quantityRules", quantityRules);
    }
  }

  public QuantityRulesAddGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "quantityRulesAdd";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String priceListId;

    private List<QuantityRuleInput> quantityRules;

    private String queryName;

    public QuantityRulesAddGraphQLQuery build() {
      return new QuantityRulesAddGraphQLQuery(priceListId, quantityRules, queryName, fieldsSet);
               
    }

    /**
     * The ID of the price list to which the quantity rules will be added or updated.
     */
    public Builder priceListId(String priceListId) {
      this.priceListId = priceListId;
      this.fieldsSet.add("priceListId");
      return this;
    }

    /**
     * The list of quantity rules to add or update in the price list.
     */
    public Builder quantityRules(List<QuantityRuleInput> quantityRules) {
      this.quantityRules = quantityRules;
      this.fieldsSet.add("quantityRules");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
