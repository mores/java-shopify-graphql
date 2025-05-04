package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Activates and deactivates payment customizations.
 */
public class PaymentCustomizationActivationGraphQLQuery extends GraphQLQuery {
  public PaymentCustomizationActivationGraphQLQuery(List<String> ids, boolean enabled,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (ids != null || fieldsSet.contains("ids")) {
        getInput().put("ids", ids);
    }getInput().put("enabled", enabled);                   
  }

  public PaymentCustomizationActivationGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "paymentCustomizationActivation";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private List<String> ids;

    private boolean enabled;

    private String queryName;

    public PaymentCustomizationActivationGraphQLQuery build() {
      return new PaymentCustomizationActivationGraphQLQuery(ids, enabled, queryName, fieldsSet);
               
    }

    /**
     * The global IDs of the payment customizations.
     */
    public Builder ids(List<String> ids) {
      this.ids = ids;
      this.fieldsSet.add("ids");
      return this;
    }

    /**
     * The enabled status of the payment customizations.
     */
    public Builder enabled(boolean enabled) {
      this.enabled = enabled;
      this.fieldsSet.add("enabled");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
