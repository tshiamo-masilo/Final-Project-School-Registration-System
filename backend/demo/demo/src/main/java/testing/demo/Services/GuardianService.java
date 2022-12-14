package testing.demo.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import testing.demo.Repository.GuardianRepo;
import testing.demo.model.Guardian;

import java.util.List;
@Service
public class GuardianService {
    @Autowired
    private GuardianRepo guardianRepo;

    public Guardian saveGuardian(Guardian guardian){
        return guardianRepo.save(guardian);
    }
    public Guardian getGuardianById(int id){
        return guardianRepo.findById(id).orElse(null);
    }
    public List<Guardian> getAllGuardian(){
        return guardianRepo.findAll();
    }
    public String deleteGuardianById(int id){
        guardianRepo.deleteById(id);
        return "Record Deleted";
    }
    public String deleteAllGuardian(){
        guardianRepo.deleteAll();
        return "All Records are deleted";
    }

    public Guardian updateGuardian(Guardian guardian){
        Guardian existingGuardian=guardianRepo.findById(guardian.getId()).orElse(null);
        existingGuardian.setFirstName(guardian.getFirstName());
        existingGuardian.setHomeAddress(guardian.getHomeAddress());
        existingGuardian.setPhoneNumber(guardian.getPhoneNumber());
        return guardianRepo.save(existingGuardian);
    }
}
