/*
 * You can use the following import statements
 *
 * import org.springframework.beans.factory.annotation.Autowired;
 * import org.springframework.http.HttpStatus;
 * import org.springframework.stereotype.Service;
 * import org.springframework.web.server.ResponseStatusException;
 * 
 * import java.util.*;
 *
 */

// Write your code here
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SponsorJpaService {
    @Autowired
    private SponsorRepository sponsorRepository;

    // Implement methods to interact with SponsorRepository

    public Sponsor saveOrUpdateSponsor(Sponsor sponsor) {
        return sponsorRepository.save(sponsor);
    }

    public void deleteSponsor(int sponsorId) {
        sponsorRepository.deleteById(sponsorId);
    }

    public Sponsor getSponsorById(int sponsorId) {
        return sponsorRepository.findById(sponsorId)
                .orElseThrow(() -> new RuntimeException("Sponsor not found with id: " + sponsorId));
    }

    public List<Sponsor> getAllSponsors() {
        return sponsorRepository.findAll();
    }
}
