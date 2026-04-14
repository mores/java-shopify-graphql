package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.OnlineStoreThemeFilesUpsertFileInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Creates or updates theme files in an online store theme. This mutation allows
 * batch operations on multiple theme files, either creating new files or
 * overwriting existing ones with the same filename.
 *   
 * > Note: You can process a maximum of 50 files in a single request.
 *   
 * Each file requires a filename and body content. The body must specify a [`type`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/themeFilesUpsert#arguments-files.fields.body.type)
 * with the corresponding [`value`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/themeFilesUpsert#arguments-files.fields.body.value).
 * The mutation returns a [`job`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/themeFilesUpsert#returns-job)
 * field for tracking asynchronous operations and an [`upsertedThemeFiles`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/themeFilesUpsert#returns-upsertedThemeFiles)
 * field with details about the processed files.
 */
public class ThemeFilesUpsertGraphQLQuery extends GraphQLQuery {
  public ThemeFilesUpsertGraphQLQuery(String themeId,
      List<OnlineStoreThemeFilesUpsertFileInput> files, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (themeId != null || fieldsSet.contains("themeId")) {
        getInput().put("themeId", themeId);
    }if (files != null || fieldsSet.contains("files")) {
        getInput().put("files", files);
    }
  }

  public ThemeFilesUpsertGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "themeFilesUpsert";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String themeId;

    private List<OnlineStoreThemeFilesUpsertFileInput> files;

    private String queryName;

    public ThemeFilesUpsertGraphQLQuery build() {
      return new ThemeFilesUpsertGraphQLQuery(themeId, files, queryName, fieldsSet);
               
    }

    /**
     * The theme to update.
     */
    public Builder themeId(String themeId) {
      this.themeId = themeId;
      this.fieldsSet.add("themeId");
      return this;
    }

    /**
     * The files to update.
     */
    public Builder files(List<OnlineStoreThemeFilesUpsertFileInput> files) {
      this.files = files;
      this.fieldsSet.add("files");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
