package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.PrivacyFeaturesEnum;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Disable a shop's privacy features.
 */
public class PrivacyFeaturesDisableGraphQLQuery extends GraphQLQuery {
  public PrivacyFeaturesDisableGraphQLQuery(List<PrivacyFeaturesEnum> featuresToDisable,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (featuresToDisable != null || fieldsSet.contains("featuresToDisable")) {
        getInput().put("featuresToDisable", featuresToDisable);
    }
  }

  public PrivacyFeaturesDisableGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "privacyFeaturesDisable";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private List<PrivacyFeaturesEnum> featuresToDisable;

    private String queryName;

    public PrivacyFeaturesDisableGraphQLQuery build() {
      return new PrivacyFeaturesDisableGraphQLQuery(featuresToDisable, queryName, fieldsSet);
               
    }

    /**
     * The list of privacy features to disable.
     */
    public Builder featuresToDisable(List<PrivacyFeaturesEnum> featuresToDisable) {
      this.featuresToDisable = featuresToDisable;
      this.fieldsSet.add("featuresToDisable");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
