package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.FileCreateInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Creates file assets using an external URL or for files that were previously uploaded using the
 * [stagedUploadsCreate mutation](https://shopify.dev/api/admin-graphql/latest/mutations/stageduploadscreate).
 * These files are added to the [Files page](https://shopify.com/admin/settings/files) in Shopify admin.
 *   
 * Files are processed asynchronously. Some data is not available until processing is completed.
 * Check [fileStatus](https://shopify.dev/api/admin-graphql/latest/interfaces/File#field-file-filestatus)
 * to know when the files are READY or FAILED. See the
 * [FileStatus](https://shopify.dev/api/admin-graphql/latest/enums/filestatus)
 * for the complete set of possible fileStatus values.
 *   
 * To get a list of all files, use the [files query](https://shopify.dev/api/admin-graphql/latest/queries/files).
 */
public class FileCreateGraphQLQuery extends GraphQLQuery {
  public FileCreateGraphQLQuery(List<FileCreateInput> files, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (files != null || fieldsSet.contains("files")) {
        getInput().put("files", files);
    }
  }

  public FileCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "fileCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private List<FileCreateInput> files;

    private String queryName;

    public FileCreateGraphQLQuery build() {
      return new FileCreateGraphQLQuery(files, queryName, fieldsSet);
               
    }

    /**
     * List of new files to be created.
     */
    public Builder files(List<FileCreateInput> files) {
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
