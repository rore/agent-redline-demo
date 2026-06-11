# agent-redline-demo — greenfield

Bare Spring Boot service in hexagonal layout. **No** `agent-policy.yaml`,
**no** `AGENTS.md`, **no** per-checkpoint docs, **no** CI workflow.

This branch is the starting point for testing **agent-redline bootstrap mode**.
Drop the agent-redline skill into a Claude Code or Codex session pointed at
a checkout of this branch, ask the agent to set up agent-redline, and observe
what it produces.

The expected output is roughly what the `main` branch already has. See the
`main` branch README for the post-bootstrap state.
