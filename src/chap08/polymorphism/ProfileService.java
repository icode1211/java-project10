package chap08.polymorphism;

public class ProfileService {

//    public void saveProfile() {
//        ProfileRepository repository = new ProfileMemoryRepository();
//        repository.save();
//    }

    public void saveProfile(ProfileRepository repository) {
        repository.save();
    }
}
