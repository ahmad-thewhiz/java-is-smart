package com.ahmad.spring_boot_rest;

import com.ahmad.spring_boot_rest.model.JobPost;
import com.ahmad.spring_boot_rest.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class JobRestController {

    @Autowired
    private JobService jobService;

    @GetMapping("jobPost")
//    @ResponseBody // it will not look for views rather return the actual data for Controller
    public List<JobPost> getAllJobs() {
        return jobService.getAllJobs();
    }

    @GetMapping("jobPost/{postId}")
    public JobPost getJobById(@PathVariable("postId") int postId) {
        return jobService.getJobById(postId);
    }

    @PostMapping("jobPost")
    public void addJob(@RequestBody JobPost jobPost) {
        jobService.addJob(jobPost);
    }

    @PutMapping("jobPost")
    public JobPost updateJob(@RequestBody JobPost jobPost) {
        jobService.updateJob(jobPost);

        return jobService.getJobById(jobPost.getPostId());
    }

    @DeleteMapping("jobPost/{postId}")
    public void deleteJob(@PathVariable("postId") int postId) {
        jobService.deleteJobById(postId);
    }

    @GetMapping("load")
    public String loadData() {
        jobService.load();

        return "Success";
    }

    @GetMapping("jobPost/keyword/{keyword}")
    public List<JobPost> searchByKeyword(@PathVariable("keyword") String keyword) {
        return jobService.repo.findByPostProfileContainingOrPostDescContaining(keyword, keyword);
    }
}
