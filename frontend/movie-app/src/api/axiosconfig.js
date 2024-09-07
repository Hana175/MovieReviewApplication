import axios from "axios";

export default axios.create({
  baseURL: "https://567f-154-176-119-15.ngrok-free.app/",
  headers: { "ngrok-skip-browser-warning": "true" },
});
