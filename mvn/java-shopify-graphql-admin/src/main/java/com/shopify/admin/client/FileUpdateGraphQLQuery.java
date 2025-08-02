package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.FileUpdateInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Updates properties, content, and metadata associated with an existing file
 * asset that has already been uploaded to Shopify.
 *   
 * Use the `fileUpdate` mutation to modify various aspects of files already stored in your store.
 * Files can be updated individually or in batches.
 *   
 * The `fileUpdate` mutation supports updating multiple file properties:
 *   
 * - **Alt text**: Update accessibility descriptions for images and other media.
 * - **File content**: Replace image or generic file content while maintaining the same URL.
 * - **Filename**: Modify file names (extension must match the original).
 * - **Product references**: Add or remove associations between files and products. Removing file-product associations
 * deletes the file from the product's media gallery and clears the image from any product variants that were using it.
 *   
 * The mutation handles different file types with specific capabilities:
 *   
 * - **Images**: Update preview images, original source, filename, and alt text.
 * - **Generic files**: Update original source, filename, and alt text.
 * - **Videos and 3D models**: Update alt text and product references.
 *   
 * > Note:
 * > Files must be in `ready` state before they can be updated. The mutation includes file locking to prevent
 * > conflicts during updates. You can't simultaneously update both `originalSource` and `previewImageSource`.
 *   
 * After updating files, you can use related mutations for additional file management:
 *   
 * - [`fileCreate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/fileCreate):
 * Create new file assets from external URLs or staged uploads.
 * - [`fileDelete`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/fileDelete):
 * Remove files from your store when they are no longer needed.
 *   
 * Learn how to manage
 * [product media and file assets](https://shopify.dev/docs/apps/build/online-store/product-media)
 * in your app.
 */
public class FileUpdateGraphQLQuery extends GraphQLQuery {
  public FileUpdateGraphQLQuery(List<FileUpdateInput> files, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (files != null || fieldsSet.contains("files")) {
        getInput().put("files", files);
    }
  }

  public FileUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "fileUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private List<FileUpdateInput> files;

    private String queryName;

    public FileUpdateGraphQLQuery build() {
      return new FileUpdateGraphQLQuery(files, queryName, fieldsSet);
               
    }

    /**
     * List of files to be updated.
     */
    public Builder files(List<FileUpdateInput> files) {
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
