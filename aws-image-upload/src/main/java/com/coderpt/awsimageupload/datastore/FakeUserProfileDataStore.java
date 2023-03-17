package com.coderpt.awsimageupload.datastore;

import com.coderpt.awsimageupload.profile.UserProfile;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {

    private static final List<UserProfile> USER_PROFILE_LIST = new ArrayList<>();

    static {
        USER_PROFILE_LIST.add(new UserProfile(UUID.fromString("46840a9b-5813-4e36-ac57-fa3d36f95944"),"janetjones", null));
        USER_PROFILE_LIST.add(new UserProfile(UUID.fromString("0dae023a-388e-4c6c-b0de-d8187fd7bdb5"),"antoniojunior", null));
    }

    public List<UserProfile> getUserProfiles(){
        return USER_PROFILE_LIST;
    }

}
