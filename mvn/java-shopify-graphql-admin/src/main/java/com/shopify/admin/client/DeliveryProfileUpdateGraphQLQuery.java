package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.DeliveryProfileInput;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Update a delivery profile.
 */
public class DeliveryProfileUpdateGraphQLQuery extends GraphQLQuery {
  public DeliveryProfileUpdateGraphQLQuery(String id, DeliveryProfileInput profile,
      Boolean leaveLegacyModeProfiles, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (profile != null || fieldsSet.contains("profile")) {
        getInput().put("profile", profile);
    }if (leaveLegacyModeProfiles != null || fieldsSet.contains("leaveLegacyModeProfiles")) {
        getInput().put("leaveLegacyModeProfiles", leaveLegacyModeProfiles);
    }
  }

  public DeliveryProfileUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "deliveryProfileUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private DeliveryProfileInput profile;

    private Boolean leaveLegacyModeProfiles;

    private String queryName;

    public DeliveryProfileUpdateGraphQLQuery build() {
      return new DeliveryProfileUpdateGraphQLQuery(id, profile, leaveLegacyModeProfiles, queryName, fieldsSet);
               
    }

    /**
     * The ID of the delivery profile to update.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * Specifies the input fields for a delivery profile.
     */
    public Builder profile(DeliveryProfileInput profile) {
      this.profile = profile;
      this.fieldsSet.add("profile");
      return this;
    }

    /**
     * Whether this delivery profile should leave legacy mode.
     */
    public Builder leaveLegacyModeProfiles(Boolean leaveLegacyModeProfiles) {
      this.leaveLegacyModeProfiles = leaveLegacyModeProfiles;
      this.fieldsSet.add("leaveLegacyModeProfiles");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
