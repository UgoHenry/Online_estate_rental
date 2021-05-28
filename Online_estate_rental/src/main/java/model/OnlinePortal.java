package model;

import javax.persistence.*;

@Entity
@Table(name = "online_portal")
public class OnlinePortal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "online_portal_id")
    private int onlinePortalId;
    @Column(name = "enter_search")
    private String enterSearch;
    @Column(name = "upload_paid_advert")
    private String uploadPaidAdvert;

    public int getOnlinePortalId() {
        return onlinePortalId;
    }

    public void setOnlinePortalId(int onlinePortalId) {
        this.onlinePortalId = onlinePortalId;
    }

    public String getEnterSearch() {
        return enterSearch;
    }

    public void setEnterSearch(String enterSearch) {
        this.enterSearch = enterSearch;
    }

    public String getUploadPaidAdvert() {
        return uploadPaidAdvert;
    }

    public void setUploadPaidAdvert(String uploadPaidAdvert) {
        this.uploadPaidAdvert = uploadPaidAdvert;
    }

    @Override
    public String toString() {
        return "OnlinePortal{" +
                "onlinePortalId=" + onlinePortalId +
                ", enterSearch='" + enterSearch + '\'' +
                ", uploadPaidAdvert='" + uploadPaidAdvert + '\'' +
                '}';
    }
}
