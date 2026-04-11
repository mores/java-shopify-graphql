package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Revokes previously granted access scopes from an app installation, allowing
 * merchants to reduce an app's permissions without completely uninstalling it.
 * This provides granular control over what data and functionality apps can access.
 *   
 * For example, if a merchant no longer wants an app to access customer
 * information but still wants to use its inventory features, they can revoke the
 * customer-related scopes while keeping inventory permissions active.
 *   
 * Use the `appRevokeAccessScopes` mutation to:
 * - Remove specific permissions from installed apps
 * - Maintain app functionality while minimizing data exposure
 *   
 * The mutation returns details about which scopes were successfully revoked and
 * any errors that prevented certain permissions from being removed.
 *   
 * Learn more about [managing app permissions](https://shopify.dev/docs/apps/build/authentication-authorization/app-installation/manage-access-scopes#revoke-granted-scopes-dynamically).
 */
public class AppRevokeAccessScopesGraphQLQuery extends GraphQLQuery {
  public AppRevokeAccessScopesGraphQLQuery(List<String> scopes, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (scopes != null || fieldsSet.contains("scopes")) {
        getInput().put("scopes", scopes);
    }
  }

  public AppRevokeAccessScopesGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "appRevokeAccessScopes";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private List<String> scopes;

    private String queryName;

    public AppRevokeAccessScopesGraphQLQuery build() {
      return new AppRevokeAccessScopesGraphQLQuery(scopes, queryName, fieldsSet);
               
    }

    /**
     * The list of scope handles to revoke.
     */
    public Builder scopes(List<String> scopes) {
      this.scopes = scopes;
      this.fieldsSet.add("scopes");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
