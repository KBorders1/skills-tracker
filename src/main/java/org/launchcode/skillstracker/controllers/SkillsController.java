package org.launchcode.skillstracker.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {

    // h1 with title "Skills Tracker"
    // h2
    // ol with 3 programming languages

    @GetMapping("")
    @ResponseBody
    public String skillDisplay() {
        return "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here's the list!</h2>" +
                "<ol>" +
                "<li>Perl</l1>" +
                "<li>Ruby</li>" +
                "<li>Rust</li>" +
                "</ol>";
    }

    @GetMapping("form")
    @ResponseBody
    public String skillsForm() {
        String htmlForm =
                "<form method='post' action=''>" +
                        "Name:<br>" +
                        "<input type = 'text' name = 'name' />" +
                        "<br>My favorite language:<br>" +
                        "<select name = 'firstChoice'>" +
                        "<option value = 'Java'>Java</option>" +
                        "<option value = 'Javascript'>JavaScript</option>" +
                        "<option value = 'Python'>Python</option>" +
                        "</select>" +
                        "<br>My second favorite language:<br>" +
                        "<select name = 'secondChoice'>" +
                        "<option value = 'Java'>Java</option>" +
                        "<option value = 'Javascript'>JavaScript</option>" +
                        "<option value = 'Python'>Python</option>" +
                        "</select>" +
                        "<br>My third favorite language:<br>" +
                        "<select name = 'thirdChoice'>" +
                        "<option value = 'Java'>Java</option>" +
                        "<option value = 'Javascript'>JavaScript</option>" +
                        "<option value = 'Python'>Python</option>" +
                        "</select><br>" +
                        "<input type ='submit'>" +
                "</form>";
        return htmlForm;
    }

    @PostMapping(value="form")
    @ResponseBody
    public String displayResponse(@RequestParam String name, @RequestParam String firstChoice, @RequestParam String secondChoice, @RequestParam String thirdChoice) {
        String html = "<h1>" + name + "</h1>" +
                "<h2>My favorite languages:</h2>" +
                "<ol>" +
                "<li>" + firstChoice + "</li>" +
                "<li>" + secondChoice + "</li>" +
                "<li>" + thirdChoice + "</li>" +
                "</ol>";

        return html;
    }
}
