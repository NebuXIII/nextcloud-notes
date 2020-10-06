package it.niedermann.owncloud.notes.persistence.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import it.niedermann.owncloud.notes.shared.model.CategorySortingMethod;

@Entity
public class Category {
    @PrimaryKey
    private long id;
    private long accountId;
    private String title;
    private CategorySortingMethod categorySortingMethod;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getAccountId() {
        return accountId;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public CategorySortingMethod getCategorySortingMethod() {
        return categorySortingMethod;
    }

    public void setCategorySortingMethod(CategorySortingMethod categorySortingMethod) {
        this.categorySortingMethod = categorySortingMethod;
    }
}
//                "FOREIGN KEY(" + key_category + ") REFERENCES " + table_category + "(" + key_category_id + "), " +
//                "FOREIGN KEY(" + key_account_id + ") REFERENCES " + table_accounts + "(" + key_id + "))");
//                DatabaseIndexUtil.createIndex(db, table_notes, key_remote_id, key_account_id, key_status, key_favorite, key_category, key_modified);