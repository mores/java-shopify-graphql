package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.QuantityRuleInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


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

    
    public Builder priceListId(String priceListId) {
      this.priceListId = priceListId;
      this.fieldsSet.add("priceListId");
      return this;
    }

    
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
