package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.FileCreateInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Creates file assets for a store from external URLs or files that were previously uploaded using the
 * [`stagedUploadsCreate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/stageduploadscreate)
 * mutation.
 *   
 * Use the `fileCreate` mutation to add various types of media and documents to your store. These files are added to the
 * [**Files** page](https://shopify.com/admin/settings/files) in the Shopify admin and can be referenced by other
 * resources in your store.
 *   
 * The `fileCreate` mutation supports multiple file types:
 *   
 * - **Images**: Product photos, variant images, and general store imagery
 * - **Videos**: Shopify-hosted videos for product demonstrations and marketing
 * - **External videos**: YouTube and Vimeo videos for enhanced product experiences
 * - **3D models**: Interactive 3D representations of products
 * - **Generic files**: PDFs, documents, and other file types for store resources
 *   
 * The mutation handles duplicate filenames using configurable resolution modes that automatically append UUIDs,
 * replace existing files, or raise errors when conflicts occur.
 *   
 * > Note:
 * > Files are processed asynchronously. Check the
 * > [`fileStatus`](https://shopify.dev/docs/api/admin-graphql/latest/interfaces/File#fields-fileStatus)
 * > field to monitor processing completion. The maximum number of files that can be created in a single batch is 250.
 *   
 * After creating files, you can make subsequent updates using the following mutations:
 *   
 * - [`fileUpdate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/fileUpdate):
 * Update file properties such as alt text or replace file contents while preserving the same URL.
 * - [`fileDelete`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/fileDelete):
 * Remove files from your store when they are no longer needed.
 *   
 * To list all files in your store, use the
 * [`files`](https://shopify.dev/docs/api/admin-graphql/latest/queries/files) query.
 *   
 * Learn how to manage
 * [product media and file assets](https://shopify.dev/docs/apps/build/online-store/product-media)
 * in your app.
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
